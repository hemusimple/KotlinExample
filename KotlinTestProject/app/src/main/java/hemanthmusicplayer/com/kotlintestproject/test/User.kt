package hemanthmusicplayer.com.kotlintestproject.test

import java.io.Serializable

/**
 * Created by SAFACS on 7/22/2018.
 */
public class User():Serializable{
    var firstname: String = "";
    var lastName: String = "";

    constructor(first: String, last: String):this() {
        this.firstname = first
        this.lastName = last
    }
}