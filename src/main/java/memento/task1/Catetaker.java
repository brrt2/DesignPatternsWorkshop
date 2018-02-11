package memento.task1;

import java.util.ArrayList;
import java.util.List;

public class Catetaker {

  private List<Memento> ledTvList = new ArrayList<>();

  public void addStateToStorage(Memento m) {

    ledTvList.add(m);
    System.out.println("Led TV snapshot maintained by careTaker : " + ledTvList);

  }

  public Memento getPreviousState(int index) {
    return ledTvList.get(index);
  }

}
