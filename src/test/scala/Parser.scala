import yafl.SourceFile
import yafl.parser.Parser
import yafl.syntax.TermTree


final class ParserTests extends munit.FunSuite:

  test("conditional"):
    // Create a file containing the text of the program
    val input = SourceFile("test", "if true then 1 else 2")

    // Parse the program
    val program = Parser.parse(input)

    // Assert that the value is correct type
    assert(program.value.isInstanceOf[TermTree.Conditional])

end ParserTests