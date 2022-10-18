package com.example.myapplication

import android.icu.lang.UCharacter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    var NewLine = true;
    var numbers = " ";
    var operation = "+";
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun ConcatEvent(view: View){
       if(NewLine)
           findViewById<EditText>(R.id.editText).setText("");
        NewLine = false;

      var click = findViewById<EditText>(R.id.editText).text.toString();
      var selecet = view as Button;
      when(selecet.id){
          findViewById<Button>(R.id.one).id ->{click +='1'}
          findViewById<Button>(R.id.two).id ->{click +='2'}
          findViewById<Button>(R.id.three).id ->{click +='3'}
          findViewById<Button>(R.id.four).id ->{click +='4'}
          findViewById<Button>(R.id.five).id ->{click +='5'}
          findViewById<Button>(R.id.six).id ->{click +='6'}
          findViewById<Button>(R.id.seven).id ->{click +='7'}
          findViewById<Button>(R.id.eight).id ->{click +='8'}
          findViewById<Button>(R.id.nine).id ->{click +='9'}
          findViewById<Button>(R.id.zero).id ->{click +='0'}
          findViewById<Button>(R.id.Dot).id ->{click +='.'}
          findViewById<Button>(R.id.PlusMainus).id ->{click = "-${click}"}

      }
       var valus = findViewById<EditText>(R.id.editText)
        valus.setText(click)
    }
    fun MathEvents(view:View){
        NewLine = true;
        numbers = findViewById<EditText>(R.id.editText).text.toString();
        var select = view as Button
        when(select.id){
            findViewById<Button>(R.id.multiply).id ->{operation ="*"};
            findViewById<Button>(R.id.Minus).id ->{operation ="-"};
            findViewById<Button>(R.id.Plus).id ->{operation ="+"};
            findViewById<Button>(R.id.Divide).id ->{operation ="/"};

        }

    }

    fun equalEvent(view:View){
        var newNumber = findViewById<EditText>(R.id.editText).text.toString();
        var result = 0.0;
        when(operation){
            "+" ->{result = numbers.toDouble() + newNumber.toDouble()}
            "*" ->{result = numbers.toDouble() * newNumber.toDouble()}
            "-" ->{result = numbers.toDouble() - newNumber.toDouble()}
            "/" ->{result = numbers.toDouble() / newNumber.toDouble()}
        }
        findViewById<EditText>(R.id.editText).setText(result.toString());
    }
fun AC(view:View){
    findViewById<EditText>(R.id.editText).setText("0");
    NewLine = true;
}

    fun Precentage(view:View){
        var no = findViewById<EditText>(R.id.editText).text.toString().toDouble() / 100;
        findViewById<EditText>(R.id.editText).setText(no.toString())
        NewLine= true;
    }
    fun RootEvent(view:View){
        var no = Math.sqrt(findViewById<EditText>(R.id.editText).text.toString().toDouble()) ;
        findViewById<EditText>(R.id.editText).setText(no.toString())
        NewLine= true;
    }
}