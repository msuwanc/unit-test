import org.scalatest.FlatSpec

class MainSpec extends FlatSpec {
  "getObjects" should "ok when input is valid" in {
    val validId: Int = 1
    val result: Seq[Object] = Main.getObjects(validId)

    assert(result.isEmpty == false)
  }

  "getObjects" should "return empty list when input is invalid" in {
    val invalidId: Int = -1
    val result: Seq[Object] = Main.getObjects(invalidId)

    assert(result.isEmpty == true)
  }
}