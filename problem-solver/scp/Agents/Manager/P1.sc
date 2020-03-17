P1=[*

	//geometry _-> concept_triangle;;
	concept_triangle _-> _t;;
				
	_t _=> nrel_perimeter:: _per;;
	_t _=> nrel_side:: _a1; _b1; _c1;;
				        
	_a1 _=> nrel_length:: _a;;
	_b1 _=> nrel_length:: _b;;	
	_c1 _=> nrel_length:: _c;;
	_t _=> nrel_square:: _s;;

*];;
