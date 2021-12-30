package demos

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

class ViewModel : BaseObservable() {
    @Bindable
    var text: String = "change me"
        set(newText) {
            if (text != newText) {
                field = newText;
            }
            notifyPropertyChanged(BR.text)
        }

}