package id.slametriyadi.simplemvpkotlin

import android.widget.EditText

class MainPresenter(val mainView: MainView) {

    fun hitung(a: String, b: String) {

        if (a == "" || b == "") {
            mainView.omError("Ojo Kosong Plo")
        } else {

            val intA = a.toInt()
            val intB = b.toInt()

            val result = intA + intA * intB
            mainView.lempar(result)

        }

    }

    fun edtSetError(a: EditText, b: EditText){
        if (a.text.isEmpty()){
            a.setError("Colom A tidak boleh kosong")
        } else if (b.text.isEmpty()){
            b.setError("Colom B tidak boleh kosong")
        }
    }
}