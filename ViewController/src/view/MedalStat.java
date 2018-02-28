package view;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MedalStat
{
  private String countryId;
  private String name;
  private int rank;

  private int gold;
  private int silver;
  private int bronze;

  public void setCountryId(String pCountryId)
  {
    this.countryId = pCountryId;
  }

  public String getCountryId()
  {
    return countryId;
  }

  public void setGold(int pGold)
  {
    this.gold = pGold;
  }

  public int getGold()
  {
    return gold;
  }

  public void setSilver(int pIlver)
  {
    this.silver = pIlver;
  }

  public int getSilver()
  {
    return silver;
  }

  public void setBronze(int pBronze)
  {
    this.bronze = pBronze;
  }

  public int getBronze()
  {
    return bronze;
  }

  public void setName(String pName)
  {
    this.name = pName;
  }

  public String getName()
  {
    return name;
  }

  public void setRank(int pRank)
  {
    this.rank = pRank;
  }

  public int getRank()
  {
    return rank;
  }

  public int getTotal()
  {
    return gold + silver + bronze;
  }

  public static MedalStat getInstance(String countryId, String name, int rank, int gold, int silver, int bronze)
  {
    MedalStat medalStat = new MedalStat();
    medalStat.setCountryId(countryId);
    medalStat.setGold(gold);
    medalStat.setSilver(silver);
    medalStat.setBronze(bronze);
    medalStat.setName(name);
    medalStat.setRank(rank);

    return medalStat;
  }


}
