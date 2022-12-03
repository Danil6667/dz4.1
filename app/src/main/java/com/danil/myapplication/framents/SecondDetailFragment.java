package com.danil.myapplication.framents;

class SecondDetailFragment : Fragment() {

private var binding: FragmentSecondDetailBinding? = null
private val args by navArgs<SecondDetailFragmentArgs>()

        override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
        ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSecondDetailBinding.inflate(inflater, container, false)
        return binding?.root
        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getData()
        }

private fun getData() {
        binding?.detImg?.let {
        Glide.with(it).load(args.image)
        .into(it)
        }
        }

        override fun onDestroyView() {
        super.onDestroyView()
        binding = null
        }
        }
