package br.edu.utfpr.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.edu.utfpr.affirmations.adapter.ItemAdapter
import br.edu.utfpr.affirmations.data.Datasource

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>( R.id.recycler_view )

        val myDataset = Datasource().loadAffirmation()

        recyclerView.adapter = ItemAdapter( this, myDataset )
        recyclerView.setHasFixedSize( true )

    }
}