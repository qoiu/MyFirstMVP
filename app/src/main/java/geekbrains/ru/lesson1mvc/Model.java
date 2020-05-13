package geekbrains.ru.lesson1mvc;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private List<Integer> mList = new ArrayList<>();

    public int getNewElementId(){
        int id=mList.size();
        mList.add(id,0);
        return id;
    }

    public int getElementValueAtIndex(int _index){
        return mList.get(_index);
    }

    public void setElementValueAtIndex(int _index,int id){
        mList.set(_index, id);
    }
}

