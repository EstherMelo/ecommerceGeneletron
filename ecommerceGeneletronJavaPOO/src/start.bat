@title Bem Vind(a/o/e) Ao E-Commerce GenEletron!
@SET JAVA_TOOL_OPTIONS=-Dfile.encoding=UTF8
@cd ../
@javac src/app/TelaPrincipal.java src/entities/Produto.java src/entities/NotaFiscal.java src/app/TelaFormaDePagamento.java src/app/TelaDadosDoCliente.java src/app/TelaNotaFiscal.java src/app/TelaInicial.java
@cd src
@cls
@java app/TelaPrincipal
@pause