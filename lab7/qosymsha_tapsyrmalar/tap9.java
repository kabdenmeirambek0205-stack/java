{
float _backset5656 = abs(_vertexpos5654.y);
(_vertexpos5654.y = 0.0);
(_vertexpos5654.x += (((_backset5656 * sign(_corner5638.x)) * _pixellength5642.x) / _pixellength5642.y));
(_coverage5650 = ((((_coverage5650 - 0.5) * abs(_corner5638.y)) / (abs(_corner5638.y) + _backset5656)) + 0.5));
}
}
float2x2 _skewmatrix5657 = mat2_ctor(_skew.xy, _skew.zw);
float2 _devcoord5658 = (mul(_vertexpos5654, transpose(_skewmatrix5657)) + _translate_and_localrotate);
if ((0.0 != _is_linear_coverage5641))
{
(_varccoord_S0 = vec2_ctor(0.0, (_coverage5650 * _coverage_multiplier5649)));
}
else
{
float2 _arccoord5659 = ((1.0 - abs(_radius_outset5639)) + ((_aa_outset5653 / _radii5647) * _corner5638));
(_varccoord_S0 = vec2_ctor((_arccoord5659.x + 1.0), _arccoord5659.y));