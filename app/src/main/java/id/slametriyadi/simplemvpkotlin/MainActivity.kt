package id.slametriyadi.simplemvpkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity(), MainView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1.setOnClickListener {
            val presenter = MainPresenter(this)
            presenter.hitung(edt1.text.toString(), edt2.text.toString())
            presenter.edtSetError(edt1, edt2)
        }
    }

    override fun lempar(hasil: Int) {
        txtHasil.text = hasil.toString()
        Toast.makeText(this, "$hasil", Toast.LENGTH_LONG).show()
    }

    override fun omError(msg: String) {
        txtHasil.text = msg
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
    }
}
