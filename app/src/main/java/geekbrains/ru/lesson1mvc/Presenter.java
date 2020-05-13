package geekbrains.ru.lesson1mvc;

import android.util.Log;

import java.util.HashMap;
import java.util.Map;

public class Presenter {
    private static final String TAG =Presenter.class.getName() ;
    private MainView view;
    private Model model;
    private Map<Integer,Integer> elementConnector;

    public Presenter(MainView view) {
        this.view = view;
        elementConnector =new HashMap<>();
        model = new Model();
    }

    public void addBtn(int btnId){
        elementConnector.put(btnId,model.getNewElementId());
    }

    private int calcNewValue(int modelId){
        return model.getElementValueAtIndex(modelId)+1;
    }

    public void btnClick(int btnId){
        if(elementConnector.get(btnId)==null){
            Log.e(TAG,"Unregister button ID. Pls use addBtn for button with id "+btnId);
            return;
        }
        int newValue=calcNewValue(elementConnector.get(btnId));
        model.setElementValueAtIndex(elementConnector.get(btnId),newValue);
        view.btnPress(btnId,newValue);
    }
}
