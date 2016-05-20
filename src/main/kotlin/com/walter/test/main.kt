
import com.github.kittinunf.fuel.Fuel
import com.walter.lib.ForecastRequest

fun main(args: Array<String>) {

    /*

        ForecastRequest.COMPLETE_URL = http://api.openweathermap.org/data/2.5/forecast/city?id=524901&APPID=xxxxxxxx
        
     */
    Fuel.get(ForecastRequest.COMPLETE_URL).
            responseString { request, response, result ->
                //do something with response
                result.fold({ d ->
                    //do something with data
                    println(d)
                }, { err ->
                    //do something with error
                    println(err)
                })
        }
}