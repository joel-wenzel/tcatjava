package view;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/medalrating")
public class MedalRatingService
{
  private static MedalStatList medalStatList = new MedalStatList();
  static
  {
    medalStatList.add(MedalStat.getInstance("no", "Norway", 1, 14, 14, 11));
    medalStatList.add(MedalStat.getInstance("de", "Germany", 2, 14, 10, 7));
    medalStatList.add(MedalStat.getInstance("ca", "Canada", 3, 11, 8, 10));
    medalStatList.add(MedalStat.getInstance("us", "USA", 4, 9, 8, 6));
    medalStatList.add(MedalStat.getInstance("nl", "Netherands", 5, 8, 6, 6));
  }

  public MedalRatingService()
  {
    super();
  }


  @GET
  @Produces("application/json")
  public List<MedalStat> getRatingTable()
  {
    return medalStatList.getList();
  }


}
