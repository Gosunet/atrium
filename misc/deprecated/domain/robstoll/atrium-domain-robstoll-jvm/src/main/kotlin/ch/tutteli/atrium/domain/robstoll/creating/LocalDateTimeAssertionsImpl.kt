//TODO remove file with 1.0.0
@file:Suppress(
    "DEPRECATION",
    /* TODO remove once https://youtrack.jetbrains.com/issue/KT-35343 is fixed */
    "JAVA_MODULE_DOES_NOT_READ_UNNAMED_MODULE"
)

package ch.tutteli.atrium.domain.robstoll.creating

import ch.tutteli.atrium.creating.Expect
import ch.tutteli.atrium.domain.creating.LocalDateTimeAssertions
import ch.tutteli.atrium.domain.robstoll.lib.creating._day
import ch.tutteli.atrium.domain.robstoll.lib.creating._dayOfWeek
import ch.tutteli.atrium.domain.robstoll.lib.creating._month
import ch.tutteli.atrium.domain.robstoll.lib.creating._year
import java.time.LocalDateTime

@Deprecated("Will be removed with 1.0.0")
class LocalDateTimeAssertionsImpl : LocalDateTimeAssertions {
    override fun <T : LocalDateTime> year(expect: Expect<T>) = _year(expect)

    override fun <T : LocalDateTime> month(expect: Expect<T>) = _month(expect)

    override fun <T : LocalDateTime> day(expect: Expect<T>) = _day(expect)

    override fun <T : LocalDateTime> dayOfWeek(expect: Expect<T>) = _dayOfWeek(expect)
}
