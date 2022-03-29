package com.simonsappdev.weightinhamsters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    private lateinit var etweight: EditText
    private lateinit var tvoutput: TextView
    private lateinit var ivhamster: ImageView
    lateinit var np: NumberPicker
    private var speciesList: Array<Species>? = null
    private var currentPosition: Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etweight = findViewById(R.id.etweight)
        tvoutput = findViewById(R.id.tvoutput)
        np = findViewById(R.id.np)
        ivhamster = findViewById(R.id.ivhamster)
        npSettings()
    }

    fun npSettings() {
        val values = List(2) {speciesList}
          //  arrayOf( speciesList!![1].name
         //       "Goldhamster",
          //      "Dwarfhamster"
          //  )
        np.minValue = 0
        np.maxValue = values.size - 1
        np.displayedValues = arrayOf(
                       "Goldhamster",
                      "Dwarfhamster")
        np.wrapSelectorWheel = true
        np.setOnValueChangedListener { picker, oldVal, newVal ->
            val text = "Changed from " + values[oldVal] + " to " + values[newVal]
            if(newVal == 2){
            ivhamster.setImageResource(speciesList!![2].image)}
            Toast.makeText(this@MainActivity, text, Toast.LENGTH_SHORT).show()
        }
    }
}



