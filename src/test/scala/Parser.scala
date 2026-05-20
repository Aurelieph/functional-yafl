
import yafl.SourceFile
import yafl.parser.{Parser, Token}
import yafl.syntax.{Syntax, TermTree, TypeTree}

final class ParserTests extends munit.FunSuite:

  test("conditional"):
    val input = SourceFile("test", "if true then 1 else 0")
    val program = Parser.parse(input)
    assert(program.value.IsInstanceOF(TermTree.Conditional))

end ParserTests
