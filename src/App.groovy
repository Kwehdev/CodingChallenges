class App {
    static void main(String[] args) {
        def codingChallenges = new CodingChallenges()
        codingChallenges.getFizzBuzzAlt()
        println(codingChallenges.getSum(3, -1))
        println(codingChallenges.getAccumulation("abcd"))
        println(codingChallenges.getDuplicateCount("Indivisibilities"))
    }
}
