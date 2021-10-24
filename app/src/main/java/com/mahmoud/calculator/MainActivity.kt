package com.mahmoud.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    //----------------------------------
 var isNewOp=true
    fun bunumperEvent(view: View) {
        if(isNewOp){
            tvshowNumper.text=""
        }
        isNewOp=false
        var tvnumper:String=tvshowNumper.text.toString()
        val buSelect=view as Button
        when (buSelect.id){
            button17.id->{
            tvnumper+="0"
            }
            button13.id->{
                tvnumper+="1"
            }
            button14.id->{
                tvnumper+="2"
            }
            button15.id->{
                tvnumper+="3"
            }
            button9.id->{
                tvnumper+="4"
            }
            button10.id->{
                tvnumper+="5"
            }
            button11.id->{
                tvnumper+="6"
            }
            button5.id->{
                tvnumper+="7"
            }
            button6.id->{
                tvnumper+="8"
            }
            button7.id->{
                tvnumper+="9"
            }
            button18.id->{
                tvnumper+="."
            }
            button2.id->{
                tvnumper="-"+tvnumper
            }
        }
        tvshowNumper.text=tvnumper
    }

    var oldNumper=""
    var op="+"
    fun buOpEvent(view: View) {
        oldNumper=tvshowNumper.text.toString()
        isNewOp=true
        val buselect=view as Button
        when(buselect.id){
            button4.id->{
                op="/"
            }
            button8.id->{
                op="*"
            }
            button12.id->{
                op="-"
            }
            button16.id->{
                op="+"
            }
            button3.id->{
                op="%"
            }
        }
    }

    fun buEqualEvent(view: View) {
        val newNumber=tvshowNumper.text.toString()
        var finalNumber:Double?=null
        when(op){
            "/"->{
                finalNumber=oldNumper.toDouble() / newNumber.toDouble()
            }
            "*"->{
                finalNumber=oldNumper.toDouble() * newNumber.toDouble()
            }
            "-"->{
                finalNumber=oldNumper.toDouble() - newNumber.toDouble()
            }
            "+"->{
                finalNumber=oldNumper.toDouble() + newNumber.toDouble()
            }
            "%"->{
                finalNumber=oldNumper.toDouble() % newNumber.toDouble()
            }


        }
        tvshowNumper.text=finalNumber.toString()
        isNewOp=true
    }

    fun buclear(view: View) {
        isNewOp=true
        tvshowNumper.text="0"
    }
}