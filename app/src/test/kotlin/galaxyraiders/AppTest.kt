/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package galaxyraiders

import org.junit.jupiter.api.DisplayName
import kotlin.test.Test
import kotlin.test.assertNotNull

@DisplayName("Given an App")
class AppTest {
  @DisplayName("then it should have a greeting")
  @Test fun appHasAGreeting() {
    val classUnderTest = App()
    assertNotNull(classUnderTest.greeting, "app should have a greeting")
  }
}
