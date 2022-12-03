package com.danil.myapplication.repository;

class ModelRepository {

    private val listModelData = arrayListOf<MainModel>()

    fun getListModelData(): ArrayList<MainModel> {
        listModelData.add(
                MainModel(
                        "Android",
                        "https://yt3.ggpht.com/ytc/AMLnZu_6IaAEzXBNMN8waLwhJBhKu3TKvuLuuZ60GELzm1M=s900-c-k-c0x00ffffff-no-rj"
                )
        )
        listModelData.add(
                MainModel(
                        "C++ Development",
                        "https://ih1.redbubble.net/image.416406974.0438/st,small,507x507-pad,600x600,f8f8f8.u4.jpg"
                )
        )
        listModelData.add(
                MainModel(
                        "Java Development",
                        "https://soft-sng.ru/wp-content/uploads/Java.png"
                )
        )
        listModelData.add(
                MainModel(
                        "Python Development",
                        "https://upload.wikimedia.org/wikipedia/commons/thumb/0/0a/Python.svg/1200px-Python.svg.png"
                )
        )
        listModelData.add(
                MainModel(
                        "JavaScript Development",
                        "https://upload.wikimedia.org/wikipedia/commons/thumb/9/99/Unofficial_JavaScript_logo_2.svg/1200px-Unofficial_JavaScript_logo_2.svg.png"
                )
        )
        return listModelData
    }
}