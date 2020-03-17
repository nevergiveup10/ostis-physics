P2 = [*
	_per _<= nrel_prod:: _con1;;
        _con1 _-> two; _p;;
        _p _<= nrel_sum:: _con2;;
        _con2 _-> _a; _pma;;
        _p _<= nrel_sum:: _con3;;
        _con3 _-> _b; _pmb;;
        _p _<= nrel_sum:: _con4;;
        _con4 _-> _c; _pmc;;
        _pmabc _<= nrel_prod:: _con5;;
        _con5 _-> _p; _pma; _pmb; _pmc;;
         _s _<= nrel_pow:: _con6;;
        _con6 _-> rrel_step:: five;;
        _con6 _-> rrel_osn:: _pmabc;;
     *];;

