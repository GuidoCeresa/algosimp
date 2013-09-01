package algosimp

class ProvaController {

    def index() {
        String provaUno = 'hello, world, how, are, you'
        String uno = 'uno'
        String due = 'due'
        String tre = 'tre'
        String quattro = 'quattro'
        String cinque = 'cinque'
        String sep = '<br/>'

        provaUno.eachCsvLine { tokens ->
            //only one line in this case and tokens.length == 5
            uno=tokens[0]
            due=tokens[1]
            tre=tokens[2]
            quattro=tokens[3]
            cinque=tokens[4]
        }
        render uno + sep + due + sep + tre + sep + quattro + sep + cinque
    }
}
