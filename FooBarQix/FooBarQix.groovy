(1..100).each {
    def pfx= it%3==0?'Foo':''
    pfx += it%5==0?'Bar':''
    pfx += it%7==0?'Qix':''
    
    res = "$pfx" + "$it".collect { n ->       
       (n=='3'?'Foo':n=='5'?'Bar':n=='7'?'Qix':pfx?'':n)
    }.sum()
    
    println res
}
