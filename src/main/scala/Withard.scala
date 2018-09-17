abstract class Withard {
  def mera():String
  def hyado():String
  def io():String

  def print_spell(): Unit ={
    val elf = new ElfOfWithard
    val mera = elf.mera():String
    val hyado = elf.hyado():String
    val io = elf.io():String
    println(mera)
    println(hyado)
    println(io)
  }
}

class ElfOfWithard extends Withard{
  def mera(): String = {
    return "mera"
  }

   def hyado(): String = {
    return "hyado"
  }

   def io(): String = {
    return "io"
  }
}