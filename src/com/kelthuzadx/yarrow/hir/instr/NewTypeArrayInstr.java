package com.kelthuzadx.yarrow.hir.instr;

import com.kelthuzadx.yarrow.hir.value.Value;
import com.kelthuzadx.yarrow.hir.value.ValueType;

public class NewTypeArrayInstr extends Instruction {
    private Instruction len;
    private ValueType type;

    public NewTypeArrayInstr(Instruction len, ValueType type) {
        this.len = len;
        this.type = type;
    }
}
