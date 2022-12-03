package com.danil.myapplication.framents;

class DetailFragment : Fragment() {

private var binding: FragmentDetailBinding? = null
private val args by navArgs<DetailFragmentArgs>()

        override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
        ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDetailBinding.inflate(inflater, container,false)
        return binding?.root
        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getData()
        }

private fun getData() {
        binding?.detTxt?.text = args.name
        }

        override fun onDestroyView() {
        super.onDestroyView()
        binding = null
        }
        }
