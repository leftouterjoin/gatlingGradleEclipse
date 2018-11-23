import io.gatling.app.Gatling
import io.gatling.core.config.GatlingPropertiesBuilder

object Engine extends App {
  Gatling.main(Array("--simulation", "computerdatabase.BasicSimulation"))
}