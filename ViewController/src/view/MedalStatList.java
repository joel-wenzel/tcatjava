package view;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MedalStatList
{
  private List<MedalStat> list = new ArrayList<MedalStat>();

  public MedalStatList()
  {
    super();
  }

  public void setList(List<MedalStat> pList)
  {
    this.list = pList;
  }

  public List<MedalStat> getList()
  {
    return list;
  }

  public void add(MedalStat medalStat)
  {
    list.add(medalStat);
  }


}
