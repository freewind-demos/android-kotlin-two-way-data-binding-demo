Android Kotlin Two Way Data Binding Demo
===========================

使用Android提供的[Two Way Binding](https://developer.android.com/topic/libraries/data-binding/two-way)功能，
将界面上的某个值的显示与修改与ViewModel中的方法直接绑定起来，不需要添加listener

注意：
1. `build.gradle.kts`中要使用`kotlin("kapt")`插件，才能使用`@Bindable`注解
1. 需要在`build.gradle`中开启`buildFeatures { dataBinding = true }`
1. `activity_main.xml`中要定义好变量，并按`@={}`形式引用
1. ViewModel要继承自某个Observable，并且在相应的getter/setter中处理，尤其是setter还需要手动notify
1. Android会自动为某个Activity生成一个Binding类，可直接引用
1. 使用`ActivityMainBinding.inflate(layoutInflater)`获取binding
1. 给`binding.viewModel`设置一个ViewModel对象
1. 所有使用了该viewModel的界面对象都会自动处理显示与更新

感觉比完全自己手动操作简单了一些，但还是有点麻烦。

Run `MainActivity.kt` from your IDE.

