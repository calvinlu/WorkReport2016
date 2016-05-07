use Time::HiRes qw(time);
use POSIX qw(strftime);

print "creating new array\n";
createArray();

print "reversing array\n";
my $startTime = time();
reverseArray();
my $endTime = time();
my $runTime = ($endTime - $startTime) * 1000 ;
print "Reverse Array Time: $runTime ms\n";

sub reverseArray{
   @array = reverse @array;
}

sub createArray{
	my $arraySize = 1000000;
	for my $i (0 .. $arraySize - 1) { 
		push @array, $i;
	}
}