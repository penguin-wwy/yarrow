package com.kelthuzadx.yarrow.hir.instr;

public class NegateInstr extends Instruction {
    private Instruction left;

    public NegateInstr(Instruction left) {
        this.left = left;
    }
}
