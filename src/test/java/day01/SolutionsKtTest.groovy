package day01

import spock.lang.Specification
import spock.lang.Unroll

import static day01.SolutionsKt.solve1
import static day01.SolutionsKt.solve2
import static org.spockframework.util.CollectionUtil.listOf

class SolutionsKtTest extends Specification {

    @Unroll
    def 'should solve first for #mass'() {
        expect:
        solve1(listOf(mass)) == result

        where:
        mass   || result
        12     || 2
        14     || 2
        1969   || 654
        100756 || 33583
    }

    @Unroll
    def 'should solve second for #mass'() {
        expect:
        solve2(listOf(mass)) == result

        where:
        mass   || result
        14     || 2
        1969   || 966
        100756 || 50346
    }
}
