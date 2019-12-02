package day02

import spock.lang.Specification
import spock.lang.Unroll

import static day02.SolutionsKt.solve1
import static org.spockframework.util.CollectionUtil.listOf

class SolutionsKtTest extends Specification {

    @Unroll
    def 'should solve first for #mass'() {
        expect:
        solve1(list, list[1], list[2]) == result

        where:
        list                                             | result
        listOf(1, 9, 10, 3, 2, 3, 11, 0, 99, 30, 40, 50) | 3500
        listOf(1, 0, 0, 0, 99)                           | 2
        listOf(2, 3, 0, 3, 99)                           | 2
        listOf(2, 4, 4, 5, 99, 0)                        | 2
        listOf(1, 1, 1, 4, 99, 5, 6, 0, 99)              | 30
    }
}
