package geekbrains.ru.lesson1mvc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements MainView, View.OnClickListener{
        private Presenter presenter;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            presenter=new Presenter(this);
            presenter.addBtn(R.id.btnCounter1);
            presenter.addBtn(R.id.btnCounter2);
            presenter.addBtn(R.id.btnCounter3);
        }

        @Override
        public void onClick(View v) {
            presenter.btnClick(v.getId());
        }


    @Override
    public void btnPress(int btnId,int value) {
        ((Button)findViewById(btnId)).setText("Количество = " + value);
    }
}

