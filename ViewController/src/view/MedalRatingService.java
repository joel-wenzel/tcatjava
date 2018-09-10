package view;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import model.MedalsVORowImpl;

import model.common.AppModule;

import oracle.jbo.Row;
import oracle.jbo.client.Configuration;

@Path("/medalrating")
public class MedalRatingService
{
  private MedalStatList medalStatList;

  /*= new MedalStatList();
  static
  {
    medalStatList.add(MedalStat.getInstance("no", "Norway", 1, 14, 14, 11));
    medalStatList.add(MedalStat.getInstance("de", "Germany", 2, 14, 10, 7));
    medalStatList.add(MedalStat.getInstance("ca", "Canada", 3, 11, 8, 10));
    medalStatList.add(MedalStat.getInstance("us", "USA", 4, 9, 8, 6));
    medalStatList.add(MedalStat.getInstance("nl", "Netherands", 5, 8, 6, 6));
  }*/

  public MedalRatingService()
  {
    super();
  }


  @GET
  @Produces("application/json")
  public List<MedalStat> getRatingTable()
  {
    medalStatList = new MedalStatList();
    AppModule am = null;
    int l = 0;

    try
    {
      am = (AppModule) Configuration.createRootApplicationModule("model.AppModule", "AppModuleLocal");
      List<Row> list = am.getMedals();
      int i = 1;
      for (Row r: list)
      {
        MedalsVORowImpl row = (MedalsVORowImpl) r;
        medalStatList.add(MedalStat.getInstance(row.getCountryid(), row.getCountryname(), i++, row.getGold(), row.getSilver(), row.getBronze()));
      }
    }
    finally
    {
      if (am != null)
        Configuration.releaseRootApplicationModule(am, false);
    }


    return medalStatList.getList();
  }


}
