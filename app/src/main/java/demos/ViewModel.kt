package demos

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

class ViewModel : BaseObservable() {
    private var _text: String = "change me";

    @Bindable
    fun getText(): String {
        return _text;
    }

    fun setText(newText: String) {
        if (_text != newText) {
            _text = newText;
        }
        notifyPropertyChanged(BR.text)
    }
}