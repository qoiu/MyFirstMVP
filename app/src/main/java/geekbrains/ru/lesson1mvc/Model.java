package geekbrains.ru.lesson1mvc;

import java.util.Arrays;
import java.util.List;
import java.util.Observable;

public class Model extends Observable {
    private List<Integer> mList = Arrays.asList(0,0,0);

    public int getElementValueAtIndex(int _index){
        return mList.get(_index);
    }

    public void setElementValueAtIndex(int _index){
        int currentValue = mList.get(_index);
        mList.set(_index, currentValue + 1);
        setChanged();
        notifyObservers();
    }
}

