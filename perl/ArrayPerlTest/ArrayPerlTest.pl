use Time::HiRes qw(time);
use POSIX qw(strftime);

print "creating new array\n";
my @array = createArray();

print "reversing array\n";
my $startTime = time();
@array = reverseArray(\@array);
my $endTime = time();
my $runTime = ($endTime - $startTime) * 1000;
print "Reverse Array Time: $runTime ms\n";

sub reverseArray{
   my @beforeArray = @{$_[0]};
   my @afterArray = reverse @beforeArray;
}

sub createArray{
	my $arraySize = 100000000;
	my @newArray;
	for my $i (0 .. $arraySize - 1) { 
		push @newArray, $i;
	}
	return @newArray;
}