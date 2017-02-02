package org.bitcoins.core.script.oracle

import org.bitcoins.core.script.ScriptOperationFactory
import org.bitcoins.core.script.constant.ScriptOperation

/**
  * Created by chris on 2/1/17.
  */
sealed trait OracleOperation extends ScriptOperation

//replace OP_NOP4
case object OP_TICKERQUERY extends OracleOperation {
  override def opCode = 179
}

object OracleOperation extends ScriptOperationFactory[OracleOperation] {
  override def operations = Seq(OP_TICKERQUERY)
}