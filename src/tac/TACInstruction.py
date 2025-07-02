class TACInstruction:
    def __init__(self, opcode, dest=None, arg1=None, arg2=None):
        self.opcode = opcode
        self.dest = dest
        self.arg1 = arg1
        self.arg2 = arg2

    def __str__(self):
        if self.dest and self.arg1 and self.arg2:
            return f"{self.dest} = {self.arg1} {self.opcode} {self.arg2}"
        elif self.dest and self.arg1:
            return f"{self.dest} = {self.opcode} {self.arg1}"
        elif self.opcode == "label":
            return f"{self.dest}:"
        elif self.opcode == "goto":
            return f"goto {self.dest}"
        else:
            return f"{self.opcode} {self.dest or ''}"
