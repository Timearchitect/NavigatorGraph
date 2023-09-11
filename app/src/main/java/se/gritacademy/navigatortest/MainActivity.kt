package se.gritacademy.navigatortest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      //  supportFragmentManager.beginTransaction().add(R.id.fragmentContainerView, BlankFragment()).addToBackStack("frag1").commit()
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController
        
        findViewById<Button>(R.id.button).setOnClickListener {
            v->   navController.navigate(R.id.action_blankFragment_to_blankFragment2)
        }

        //view.findNavController().navigate(R.id.viewTransactionsAction)

    }



}