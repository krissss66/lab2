package edu.bu.projectportal

data class Project(val id: Int, var title: String, var description: String , var authors: String, var project_link: String, var fav: Boolean, var key_w: String){
    companion object {
        var project = Project(0, "Weather Forecast", "Weather Forcast is an app ...", authors = "haomingChen",project_link = "https://github.com/CS683/metcs683labs-krissss66/tree/lab2",fav = true,key_w = "cs683_lab2")
    }

//        var projects = listOf(
//            Project(0, "Weather Forecast", "Weather Forcast is an app ..."),
//            Project(1, "Connect Me", "Connect Me is an app ... "),
//            Project(2, "What to Eat", "What to Eat is an app ..."),
//            Project(3, "Project Portal", "Project Portal is an app ..."))
//    }
}