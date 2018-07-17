import math
class Substrate:

  def __init__(self, length = 1000, width = 1000, distanceApart = 50, distanceDown = 50):
    self.length = length
    self.length = width
    self.distanceApart = distanceApart
    self.distanceDown = distanceDown

  def generateHexagonLattice(self):
    latticePositions = [[False for i in range(self.length)] for j in range(self.width)]
    self.distanceDown = int(self.distanceApart * math.sqrt(3)/2)
    i = 0
    for row in range(self.length // self.distanceDown):
      if row % 2 == 1:
        i = self.distanceApart // 2
      for j in range(i, self.width, self.distanceApart):
        latticePositions[row * self.distanceDown][j] = True
    return latticePositions
  
  def generateRectangleLattice(self):
    latticePositions = [[False for i in range(self.length)] for j in range(self.width)]
    for i in range(0,self.length,self.distanceApart):
      for j in range(0,self.width,self.distanceDown):
        latticePositions[i][j] = True
    return latticePositions
  
