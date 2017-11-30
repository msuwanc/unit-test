import org.scalatest.WordSpec
import Main.getObjects
import models.Object

class MainSpec2 extends WordSpec {
  "Main" should {
    "ok" when {
      "getObject with valid input" in {
        val validId: Int = 1
        val result: Seq[Object] = getObjects(validId)
        assert(result == Seq(Object(validId, validId.toString)))
      }
      "getObject with invalid input" in {
        val invalidId: Int = -1
        val result: Seq[Object] = getObjects(invalidId)
        assert(result == Nil)
      }
    }
  }
}