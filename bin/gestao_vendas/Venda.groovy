package gestao_vendas
class Venda{
    Cliente cliente
    BigDecimal valorTotal
    List itensVenda
    static hasMany = [itensVenda: VendaItem]
    static constraints = {
        cliente(nullable:false)
        valorTotal(nullable:false)
        itensVenda(nullable:false)
    }
    static mapping = {
        id generator: 'sequence', params: [sequence: 'sequence_venda']
    }
}