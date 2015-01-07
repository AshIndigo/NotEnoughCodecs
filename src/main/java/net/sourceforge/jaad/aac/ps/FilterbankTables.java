/*
 *  Copyright (C) 2011 in-somnia
 * 
 *  This file is part of JAAD.
 * 
 *  JAAD is free software; you can redistribute it and/or modify it 
 *  under the terms of the GNU Lesser General Public License as 
 *  published by the Free Software Foundation; either version 3 of the 
 *  License, or (at your option) any later version.
 *
 *  JAAD is distributed in the hope that it will be useful, but WITHOUT 
 *  ANY WARRANTY; without even the implied warranty of MERCHANTABILITY 
 *  or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General 
 *  Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with this library.
 *  If not, see <http://www.gnu.org/licenses/>.
 */
package net.sourceforge.jaad.aac.ps;

interface FilterbankTables {

	//filter tables
	float[] G1_Q2 = {
		0.0f, 0.01899487526049f, 0.0f, -0.07293139167538f,
		0.0f, 0.30596630545168f, 0.5f
	};
	float[][][] F20_0_8 = {
		{
			{
				-5.275602918118238449e-003f, 5.275602918118238449e-003f
			}, {
				-8.688525296747684479e-003f, 2.097595483064651489e-002f
			}, {
				2.784152423076654213e-018f, 4.546865820884704590e-002f
			}, {
				2.780621498823165894e-002f, 6.713014096021652222e-002f
			}, {
				6.989827007055282593e-002f, 6.989827007055282593e-002f
			}, {
				1.089596748352050781e-001f, 4.513257369399070740e-002f
			}, {
				1.250000000000000000e-001f, -0.000000000000000000e+000f
			}
		},
		{
			{
				5.275602918118238449e-003f, 5.275602918118238449e-003f
			}, {
				2.097595483064651489e-002f, -8.688525296747684479e-003f
			}, {
				-8.352180784110216789e-018f, -4.546865820884704590e-002f
			}, {
				-6.713014096021652222e-002f, -2.780621498823165894e-002f
			}, {
				-6.989827007055282593e-002f, 6.989827007055282593e-002f
			}, {
				4.513257369399070740e-002f, 1.089596748352050781e-001f
			}, {
				1.250000000000000000e-001f, -0.000000000000000000e+000f
			}
		},
		{
			{
				5.275602918118238449e-003f, -5.275602918118238449e-003f
			}, {
				-2.097595483064651489e-002f, -8.688525296747684479e-003f
			}, {
				1.392030158257723217e-017f, 4.546865820884704590e-002f
			}, {
				6.713014096021652222e-002f, -2.780621498823165894e-002f
			}, {
				-6.989827007055282593e-002f, -6.989827007055282593e-002f
			}, {
				-4.513257369399070740e-002f, 1.089596748352050781e-001f
			}, {
				1.250000000000000000e-001f, -0.000000000000000000e+000f
			}
		},
		{
			{
				-5.275602918118238449e-003f, -5.275602918118238449e-003f
			}, {
				8.688525296747684479e-003f, 2.097595483064651489e-002f
			}, {
				-1.948842320822486010e-017f, -4.546865820884704590e-002f
			}, {
				-2.780621498823165894e-002f, 6.713014096021652222e-002f
			}, {
				6.989827007055282593e-002f, -6.989827007055282593e-002f
			}, {
				-1.089596748352050781e-001f, 4.513257369399070740e-002f
			}, {
				1.250000000000000000e-001f, -0.000000000000000000e+000f
			}
		},
		{
			{
				-5.275602918118238449e-003f, 5.275602918118238449e-003f
			}, {
				8.688525296747684479e-003f, -2.097595483064651489e-002f
			}, {
				2.505654317951126292e-017f, 4.546865820884704590e-002f
			}, {
				-2.780621498823165894e-002f, -6.713014096021652222e-002f
			}, {
				6.989827007055282593e-002f, 6.989827007055282593e-002f
			}, {
				-1.089596748352050781e-001f, -4.513257369399070740e-002f
			}, {
				1.250000000000000000e-001f, -0.000000000000000000e+000f
			}
		},
		{
			{
				5.275602918118238449e-003f, 5.275602918118238449e-003f
			}, {
				-2.097595483064651489e-002f, 8.688525296747684479e-003f
			}, {
				-1.113932234840742325e-016f, -4.546865820884704590e-002f
			}, {
				6.713014096021652222e-002f, 2.780621498823165894e-002f
			}, {
				-6.989827007055282593e-002f, 6.989827007055282593e-002f
			}, {
				-4.513257369399070740e-002f, -1.089596748352050781e-001f
			}, {
				1.250000000000000000e-001f, -0.000000000000000000e+000f
			}
		},
		{
			{
				5.275602918118238449e-003f, -5.275602918118238449e-003f
			}, {
				2.097595483064651489e-002f, 8.688525296747684479e-003f
			}, {
				-4.457577721119249819e-017f, 4.546865820884704590e-002f
			}, {
				-6.713014096021652222e-002f, 2.780621498823165894e-002f
			}, {
				-6.989827007055282593e-002f, -6.989827007055282593e-002f
			}, {
				4.513257369399070740e-002f, -1.089596748352050781e-001f
			}, {
				1.250000000000000000e-001f, -0.000000000000000000e+000f
			}
		},
		{
			{
				-5.275602918118238449e-003f, -5.275602918118238449e-003f
			}, {
				-8.688525296747684479e-003f, -2.097595483064651489e-002f
			}, {
				-1.225294700440919386e-016f, -4.546865820884704590e-002f
			}, {
				2.780621498823165894e-002f, -6.713014096021652222e-002f
			}, {
				6.989827007055282593e-002f, -6.989827007055282593e-002f
			}, {
				1.089596748352050781e-001f, -4.513257369399070740e-002f
			}, {
				1.250000000000000000e-001f, -0.000000000000000000e+000f
			}
		},};
	float[][][] F34_0_12 = {
		{
			{
				2.499001966028852333e-018f, 4.081179946660995483e-002f
			}, {
				9.868280962109565735e-003f, 3.682892769575119019e-002f
			}, {
				2.572454139590263367e-002f, 4.455621168017387390e-002f
			}, {
				4.525364190340042114e-002f, 4.525364190340042114e-002f
			}, {
				6.433108448982238770e-002f, 3.714156895875930786e-002f
			}, {
				7.824335247278213501e-002f, 2.096524275839328766e-002f
			}, {
				8.333333581686019897e-002f, -0.000000000000000000e+000f
			}
		},
		{
			{
				-7.496758571083403643e-018f, -4.081179946660995483e-002f
			}, {
				-2.696064673364162445e-002f, -2.696064673364162445e-002f
			}, {
				-5.144908279180526733e-002f, 6.300487487667377361e-018f
			}, {
				-4.525364190340042114e-002f, 4.525364190340042114e-002f
			}, {
				4.548379983937155837e-018f, 7.428313791751861572e-002f
			}, {
				5.727811157703399658e-002f, 5.727811157703399658e-002f
			}, {
				8.333333581686019897e-002f, -0.000000000000000000e+000f
			}
		},
		{
			{
				1.249459706701859770e-017f, 4.081179946660995483e-002f
			}, {
				3.682892769575119019e-002f, 9.868280962109565735e-003f
			}, {
				2.572454139590263367e-002f, -4.455621168017387390e-002f
			}, {
				-4.525364190340042114e-002f, -4.525364190340042114e-002f
			}, {
				-6.433108448982238770e-002f, 3.714156895875930786e-002f
			}, {
				2.096524275839328766e-002f, 7.824335247278213501e-002f
			}, {
				8.333333581686019897e-002f, -0.000000000000000000e+000f
			}
		},
		{
			{
				-1.749243639013440432e-017f, -4.081179946660995483e-002f
			}, {
				-3.682892769575119019e-002f, 9.868280962109565735e-003f
			}, {
				2.572454139590263367e-002f, 4.455621168017387390e-002f
			}, {
				4.525364190340042114e-002f, -4.525364190340042114e-002f
			}, {
				-6.433108448982238770e-002f, -3.714156895875930786e-002f
			}, {
				-2.096524275839328766e-002f, 7.824335247278213501e-002f
			}, {
				8.333333581686019897e-002f, -0.000000000000000000e+000f
			}
		},
		{
			{
				2.249027488606959838e-017f, 4.081179946660995483e-002f
			}, {
				2.696064673364162445e-002f, -2.696064673364162445e-002f
			}, {
				-5.144908279180526733e-002f, 1.890146246300213208e-017f
			}, {
				4.525364190340042114e-002f, 4.525364190340042114e-002f
			}, {
				-1.364514077899208006e-017f, -7.428313791751861572e-002f
			}, {
				-5.727811157703399658e-002f, 5.727811157703399658e-002f
			}, {
				8.333333581686019897e-002f, -0.000000000000000000e+000f
			}
		},
		{
			{
				-9.998443083838765445e-017f, -4.081179946660995483e-002f
			}, {
				-9.868280962109565735e-003f, 3.682892769575119019e-002f
			}, {
				2.572454139590263367e-002f, -4.455621168017387390e-002f
			}, {
				-4.525364190340042114e-002f, 4.525364190340042114e-002f
			}, {
				6.433108448982238770e-002f, -3.714156895875930786e-002f
			}, {
				-7.824335247278213501e-002f, 2.096524275839328766e-002f
			}, {
				8.333333581686019897e-002f, -0.000000000000000000e+000f
			}
		},
		{
			{
				-4.001036557844287551e-017f, 4.081179946660995483e-002f
			}, {
				-9.868280962109565735e-003f, -3.682892769575119019e-002f
			}, {
				2.572454139590263367e-002f, 4.455621168017387390e-002f
			}, {
				-4.525364190340042114e-002f, -4.525364190340042114e-002f
			}, {
				6.433108448982238770e-002f, 3.714156895875930786e-002f
			}, {
				-7.824335247278213501e-002f, -2.096524275839328766e-002f
			}, {
				8.333333581686019897e-002f, -0.000000000000000000e+000f
			}
		},
		{
			{
				-1.099801078302580426e-016f, -4.081179946660995483e-002f
			}, {
				2.696064673364162445e-002f, 2.696064673364162445e-002f
			}, {
				-5.144908279180526733e-002f, 1.228943691907911310e-016f
			}, {
				4.525364190340042114e-002f, -4.525364190340042114e-002f
			}, {
				8.871858161999514000e-017f, 7.428313791751861572e-002f
			}, {
				-5.727811157703399658e-002f, -5.727811157703399658e-002f
			}, {
				8.333333581686019897e-002f, -0.000000000000000000e+000f
			}
		},
		{
			{
				-3.001468858657248739e-017f, 4.081179946660995483e-002f
			}, {
				-3.682892769575119019e-002f, -9.868280962109565735e-003f
			}, {
				2.572454139590263367e-002f, -4.455621168017387390e-002f
			}, {
				4.525364190340042114e-002f, 4.525364190340042114e-002f
			}, {
				-6.433108448982238770e-002f, 3.714156895875930786e-002f
			}, {
				-2.096524275839328766e-002f, -7.824335247278213501e-002f
			}, {
				8.333333581686019897e-002f, -0.000000000000000000e+000f
			}
		},
		{
			{
				-1.199757848221284307e-016f, -4.081179946660995483e-002f
			}, {
				3.682892769575119019e-002f, -9.868280962109565735e-003f
			}, {
				2.572454139590263367e-002f, 4.455621168017387390e-002f
			}, {
				-4.525364190340042114e-002f, 4.525364190340042114e-002f
			}, {
				-6.433108448982238770e-002f, -3.714156895875930786e-002f
			}, {
				2.096524275839328766e-002f, -7.824335247278213501e-002f
			}, {
				8.333333581686019897e-002f, -0.000000000000000000e+000f
			}
		},
		{
			{
				-2.001900994034087417e-017f, 4.081179946660995483e-002f
			}, {
				-2.696064673364162445e-002f, 2.696064673364162445e-002f
			}, {
				-5.144908279180526733e-002f, 4.410341075931041642e-017f
			}, {
				-4.525364190340042114e-002f, -4.525364190340042114e-002f
			}, {
				-3.183866154192131596e-017f, -7.428313791751861572e-002f
			}, {
				5.727811157703399658e-002f, -5.727811157703399658e-002f
			}, {
				8.333333581686019897e-002f, -0.000000000000000000e+000f
			}
		},
		{
			{
				-1.299714618139988188e-016f, -4.081179946660995483e-002f
			}, {
				9.868280962109565735e-003f, -3.682892769575119019e-002f
			}, {
				2.572454139590263367e-002f, -4.455621168017387390e-002f
			}, {
				4.525364190340042114e-002f, -4.525364190340042114e-002f
			}, {
				6.433108448982238770e-002f, -3.714156895875930786e-002f
			}, {
				7.824335247278213501e-002f, -2.096524275839328766e-002f
			}, {
				8.333333581686019897e-002f, -0.000000000000000000e+000f
			}
		}
	};
	float[][][] F34_1_8 = {
		{
			{
				-1.107099838554859161e-002f, 1.107099838554859161e-002f
			}, {
				-1.436102297157049179e-002f, 3.467057645320892334e-002f
			}, {
				3.317501524848289120e-018f, 5.417891219258308411e-002f
			}, {
				3.221063315868377686e-002f, 7.776334881782531738e-002f
			}, {
				7.288392633199691772e-002f, 7.288392633199691772e-002f
			}, {
				1.129207387566566467e-001f, 4.677329957485198975e-002f
			}, {
				1.250000000000000000e-001f, -0.000000000000000000e+000f
			}
		},
		{
			{
				1.107099838554859161e-002f, 1.107099838554859161e-002f
			}, {
				3.467057645320892334e-002f, -1.436102297157049179e-002f
			}, {
				-9.952176390636836948e-018f, -5.417891219258308411e-002f
			}, {
				-7.776334881782531738e-002f, -3.221063315868377686e-002f
			}, {
				-7.288392633199691772e-002f, 7.288392633199691772e-002f
			}, {
				4.677329957485198975e-002f, 1.129207387566566467e-001f
			}, {
				1.250000000000000000e-001f, -0.000000000000000000e+000f
			}
		},
		{
			{
				1.107099838554859161e-002f, -1.107099838554859161e-002f
			}, {
				-3.467057645320892334e-002f, -1.436102297157049179e-002f
			}, {
				1.658695982388078236e-017f, 5.417891219258308411e-002f
			}, {
				7.776334881782531738e-002f, -3.221063315868377686e-002f
			}, {
				-7.288392633199691772e-002f, -7.288392633199691772e-002f
			}, {
				-4.677329957485198975e-002f, 1.129207387566566467e-001f
			}, {
				1.250000000000000000e-001f, -0.000000000000000000e+000f
			}
		},
		{
			{
				-1.107099838554859161e-002f, -1.107099838554859161e-002f
			}, {
				1.436102297157049179e-002f, 3.467057645320892334e-002f
			}, {
				-2.322174408430534032e-017f, -5.417891219258308411e-002f
			}, {
				-3.221063315868377686e-002f, 7.776334881782531738e-002f
			}, {
				7.288392633199691772e-002f, -7.288392633199691772e-002f
			}, {
				-1.129207387566566467e-001f, 4.677329957485198975e-002f
			}, {
				1.250000000000000000e-001f, -0.000000000000000000e+000f
			}
		},
		{
			{
				-1.107099838554859161e-002f, 1.107099838554859161e-002f
			}, {
				1.436102297157049179e-002f, -3.467057645320892334e-002f
			}, {
				2.985652834472989829e-017f, 5.417891219258308411e-002f
			}, {
				-3.221063315868377686e-002f, -7.776334881782531738e-002f
			}, {
				7.288392633199691772e-002f, 7.288392633199691772e-002f
			}, {
				-1.129207387566566467e-001f, -4.677329957485198975e-002f
			}, {
				1.250000000000000000e-001f, -0.000000000000000000e+000f
			}
		},
		{
			{
				1.107099838554859161e-002f, 1.107099838554859161e-002f
			}, {
				-3.467057645320892334e-002f, 1.436102297157049179e-002f
			}, {
				-1.327323921753538125e-016f, -5.417891219258308411e-002f
			}, {
				7.776334881782531738e-002f, 3.221063315868377686e-002f
			}, {
				-7.288392633199691772e-002f, 7.288392633199691772e-002f
			}, {
				-4.677329957485198975e-002f, -1.129207387566566467e-001f
			}, {
				1.250000000000000000e-001f, -0.000000000000000000e+000f
			}
		},
		{
			{
				1.107099838554859161e-002f, -1.107099838554859161e-002f
			}, {
				3.467057645320892334e-002f, 1.436102297157049179e-002f
			}, {
				-5.311498435898156709e-017f, 5.417891219258308411e-002f
			}, {
				-7.776334881782531738e-002f, 3.221063315868377686e-002f
			}, {
				-7.288392633199691772e-002f, -7.288392633199691772e-002f
			}, {
				4.677329957485198975e-002f, -1.129207387566566467e-001f
			}, {
				1.250000000000000000e-001f, -0.000000000000000000e+000f
			}
		},
		{
			{
				-1.107099838554859161e-002f, -1.107099838554859161e-002f
			}, {
				-1.436102297157049179e-002f, -3.467057645320892334e-002f
			}, {
				-1.460019573874804782e-016f, -5.417891219258308411e-002f
			}, {
				3.221063315868377686e-002f, -7.776334881782531738e-002f
			}, {
				7.288392633199691772e-002f, -7.288392633199691772e-002f
			}, {
				1.129207387566566467e-001f, -4.677329957485198975e-002f
			}, {
				1.250000000000000000e-001f, -0.000000000000000000e+000f
			}
		}
	};
	float[][][] F34_2_4 = {
		{
			{
				1.085320851545921149e-017f, 5.908211320638656616e-002f
			}, {
				3.444669395685195923e-002f, 3.444669395685195923e-002f
			}, {
				-0.000000000000000000e+000f, 0.000000000000000000e+000f
			}, {
				-5.500388517975807190e-002f, 5.500388517975807190e-002f
			}, {
				1.009494941872471463e-017f, 1.648630350828170776e-001f
			}, {
				1.646134406328201294e-001f, 1.646134406328201294e-001f
			}, {
				2.500000000000000000e-001f, -0.000000000000000000e+000f
			}
		},
		{
			{
				-3.255962554637763446e-017f, -5.908211320638656616e-002f
			}, {
				-3.444669395685195923e-002f, 3.444669395685195923e-002f
			}, {
				-0.000000000000000000e+000f, 0.000000000000000000e+000f
			}, {
				5.500388517975807190e-002f, 5.500388517975807190e-002f
			}, {
				-3.028484908335475644e-017f, -1.648630350828170776e-001f
			}, {
				-1.646134406328201294e-001f, 1.646134406328201294e-001f
			}, {
				2.500000000000000000e-001f, -0.000000000000000000e+000f
			}
		},
		{
			{
				1.592169551489582458e-016f, 5.908211320638656616e-002f
			}, {
				-3.444669395685195923e-002f, -3.444669395685195923e-002f
			}, {
				-0.000000000000000000e+000f, 0.000000000000000000e+000f
			}, {
				5.500388517975807190e-002f, -5.500388517975807190e-002f
			}, {
				5.047474626644296060e-017f, 1.648630350828170776e-001f
			}, {
				-1.646134406328201294e-001f, -1.646134406328201294e-001f
			}, {
				2.500000000000000000e-001f, -0.000000000000000000e+000f
			}
		},
		{
			{
				2.897845958089260835e-017f, -5.908211320638656616e-002f
			}, {
				3.444669395685195923e-002f, -3.444669395685195923e-002f
			}, {
				-0.000000000000000000e+000f, 0.000000000000000000e+000f
			}, {
				-5.500388517975807190e-002f, -5.500388517975807190e-002f
			}, {
				-7.066464344953116475e-017f, -1.648630350828170776e-001f
			}, {
				1.646134406328201294e-001f, -1.646134406328201294e-001f
			}, {
				2.500000000000000000e-001f, -0.000000000000000000e+000f
			}
		}
	};
}
