package view;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/medalrating")
public class MedalRatingService
{
  public MedalRatingService()
  {
    super();
  }


  @GET
  @Produces("application/json")
  public MedalStat getRatingTable()
  {
    return MedalStat.getInstance("US", 9, 8, 7);
  }


}
