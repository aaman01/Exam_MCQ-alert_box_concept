package com.example.exam_mcqalertboxconcept

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.exam_mcqalertboxconcept.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var Binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Binding=ActivityMainBinding.inflate(layoutInflater);

        setContentView(Binding.root)



        Binding.q1.setOnClickListener {
              val options= arrayOf("Web development", "Mobile development","AI/ML")
             var builder1=AlertDialog.Builder(this)
            builder1.setTitle("Which  field  excites you the most")
            builder1.setSingleChoiceItems(options,0,DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this," You clicked on ${options[i]}",Toast.LENGTH_SHORT).show()
            })
            builder1.show()
        }

        Binding.q3.setOnClickListener {
            val options= arrayOf("2023", "2024","2025")
            var builder1=AlertDialog.Builder(this)
            builder1.setTitle("When are you graduating")
            builder1.setSingleChoiceItems(options,0,DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this," You clicked on ${options[i]}",Toast.LENGTH_SHORT).show()
            })
            builder1.show()
        }
        Binding.q2.setOnClickListener {
            val options= arrayOf("OS", "CN","OOP")
            var builder1=AlertDialog.Builder(this)
            builder1.setTitle("Which  CS fundamental subject you like the most")
            builder1.setSingleChoiceItems(options,0,DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this," You clicked on ${options[i]}",Toast.LENGTH_SHORT).show()
            })
            builder1.show()
        }

        Binding.exit.setOnClickListener {
            var builder2=AlertDialog.Builder(this)
            builder2.setTitle("Do you want to exit")
            builder2.setMessage("Are you sure")
            builder2.setPositiveButton("Yes",DialogInterface.OnClickListener { dialogInterface, i ->
                finish()
            })

            builder2.setNegativeButton("No",DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder2.show()

        }

    }
}