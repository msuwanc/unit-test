import models.Object

object Main extends App {
  def getObjects(id: Int): List[Object] = {
    if(id < 0) List()
    else List(Object(id, id.toString))
  }
}