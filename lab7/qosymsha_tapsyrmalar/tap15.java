efine ATOMIC_COUNTER_ARRAY_STRIDE 4

// Attributes
static float4 _radii_selector = {0, 0, 0, 0};
static float4 _corner_and_radius_outsets = {0, 0, 0, 0};
static float4 _aa_bloat_and_coverage = {0, 0, 0, 0};
static float4 _radii_x = {0, 0, 0, 0};
static float4 _radii_y = {0, 0, 0, 0};
static float4 _skew = {0, 0, 0, 0};
static float2 _translate_and_localrotate = {0, 0};
static float4 _color = {0, 0, 0, 0};

static float4 gl_Position = float4(0, 0, 0, 0);

// Varyings
static noperspective float4 _vcolor_S0 = {0, 0, 0, 0};
static noperspective float2 _varccoord_S0 = {0, 0};

cbuffer DriverConstants : register(b1)
{
    float4 dx_ViewAdjust : packoffset(c1);
    float2 dx_ViewCoords : packoffset(c2);
    float2 dx_ViewS